// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryWorkloadCfVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryWorkloadCf extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryWorkloadCf Empty = new GetApplicationScopeCategoryWorkloadCf();

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="variables")
    private @Nullable List<GetApplicationScopeCategoryWorkloadCfVariable> variables;

    public Optional<List<GetApplicationScopeCategoryWorkloadCfVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetApplicationScopeCategoryWorkloadCf() {}

    private GetApplicationScopeCategoryWorkloadCf(GetApplicationScopeCategoryWorkloadCf $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryWorkloadCf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryWorkloadCf $;

        public Builder() {
            $ = new GetApplicationScopeCategoryWorkloadCf();
        }

        public Builder(GetApplicationScopeCategoryWorkloadCf defaults) {
            $ = new GetApplicationScopeCategoryWorkloadCf(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder variables(@Nullable List<GetApplicationScopeCategoryWorkloadCfVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetApplicationScopeCategoryWorkloadCfVariable... variables) {
            return variables(List.of(variables));
        }

        public GetApplicationScopeCategoryWorkloadCf build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
