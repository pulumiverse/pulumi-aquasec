// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImageAssurancePolicyCustomCheck {
    /**
     * @return Name of user account that created the policy.
     * 
     */
    private final String author;
    private final String description;
    private final String engine;
    private final Integer lastModified;
    private final String name;
    private final String path;
    private final Boolean readOnly;
    private final String scriptId;
    private final String severity;
    private final String snippet;

    @CustomType.Constructor
    private GetImageAssurancePolicyCustomCheck(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("lastModified") Integer lastModified,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("readOnly") Boolean readOnly,
        @CustomType.Parameter("scriptId") String scriptId,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("snippet") String snippet) {
        this.author = author;
        this.description = description;
        this.engine = engine;
        this.lastModified = lastModified;
        this.name = name;
        this.path = path;
        this.readOnly = readOnly;
        this.scriptId = scriptId;
        this.severity = severity;
        this.snippet = snippet;
    }

    /**
     * @return Name of user account that created the policy.
     * 
     */
    public String author() {
        return this.author;
    }
    public String description() {
        return this.description;
    }
    public String engine() {
        return this.engine;
    }
    public Integer lastModified() {
        return this.lastModified;
    }
    public String name() {
        return this.name;
    }
    public String path() {
        return this.path;
    }
    public Boolean readOnly() {
        return this.readOnly;
    }
    public String scriptId() {
        return this.scriptId;
    }
    public String severity() {
        return this.severity;
    }
    public String snippet() {
        return this.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageAssurancePolicyCustomCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private String description;
        private String engine;
        private Integer lastModified;
        private String name;
        private String path;
        private Boolean readOnly;
        private String scriptId;
        private String severity;
        private String snippet;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageAssurancePolicyCustomCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.description = defaults.description;
    	      this.engine = defaults.engine;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.scriptId = defaults.scriptId;
    	      this.severity = defaults.severity;
    	      this.snippet = defaults.snippet;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder lastModified(Integer lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        public Builder scriptId(String scriptId) {
            this.scriptId = Objects.requireNonNull(scriptId);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder snippet(String snippet) {
            this.snippet = Objects.requireNonNull(snippet);
            return this;
        }        public GetImageAssurancePolicyCustomCheck build() {
            return new GetImageAssurancePolicyCustomCheck(author, description, engine, lastModified, name, path, readOnly, scriptId, severity, snippet);
        }
    }
}
